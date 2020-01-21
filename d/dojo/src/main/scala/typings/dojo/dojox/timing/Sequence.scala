package typings.dojo.dojox.timing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/timing/Sequence.html
  *
  * This class provides functionality to really sequentialize
  * function calls. You need to provide a list of functions and
  * some parameters for each (like: pauseBefore) and they will
  * be run one after another. This can be very useful for slideshows
  * or alike things.
  * This array will contain the sequence defines resolved, so that
  * ie. repeat:10 will result in 10 elements in the sequence, so
  * the repeat handling is easier and we don't need to handle that
  * many extra cases. Also the doneFunction, if given is added at the
  * end of the resolved-sequences.
  *
  */
@JSGlobal("dojox.timing.Sequence")
@js.native
class Sequence () extends js.Object {
  /**
    * Run the passed sequence definition
    *
    * @param defs The sequence of actions
    * @param doneFunction               OptionalThe function to call when done
    */
  def go(defs: js.Array[_], doneFunction: js.Array[_]): Unit = js.native
  /**
    * Run the passed sequence definition
    *
    * @param defs The sequence of actions
    * @param doneFunction               OptionalThe function to call when done
    */
  def go(defs: js.Array[_], doneFunction: js.Function): Unit = js.native
  /**
    * This method just provides a hook from the outside, so that
    * an interrupted sequence can be continued.
    *
    */
  def goOn(): Unit = js.native
  /**
    * Stop the currently running sequence.
    * This can only interrupt the sequence not the last function that
    * had been started. If the last function was i.e. a slideshow
    * that is handled inside a function that you have given as
    * one sequence item it cant be stopped, since it is not controlled
    * by this object here. In this case it would be smarter to
    * run the slideshow using a sequence object so you can also stop
    * it using this method.
    *
    */
  def stop(): Unit = js.native
}

