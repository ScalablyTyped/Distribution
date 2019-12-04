package typings.dojo.dojox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/timing.html
  *
  * Deprecated.  Should require dojox/timing modules directly rather than trying to access them through
  * this module.
  *
  */
trait timing extends js.Object

@JSGlobal("dojox.timing")
@js.native
object timing extends js.Object {
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
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/timing/Streamer.html
    *
    * Streamer will take an input function that pushes N datapoints into a
    * queue, and will pass the next point in that queue out to an
    * output function at the passed interval; this way you can emulate
    * a constant buffered stream of data.
    *
    * @param input the function executed when the internal queue reaches minimumSize
    * @param output the function executed on internal tick
    * @param interval the interval in ms at which the output function is fired.
    * @param minimum the minimum number of elements in the internal queue.
    * @param initialData
    */
  type Streamer = js.Function5[
    /* input */ js.Function, 
    /* output */ js.Function, 
    /* interval */ Double, 
    /* minimum */ Double, 
    /* initialData */ js.Array[js.Any], 
    Unit
  ]
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/timing/doLater.html
    *
    * Check if a parameter is ready, and if not,
    * "do later". doLater will ping the parameter
    * until it evaluates to something (truthy).
    * It thens calls the caller with original
    * arguments, using the supplied context or
    * window.
    * dojox.timing.doLater(conditional) is testing if the call
    * should be done later. So it returns
    * true if the param is false.
    *
    * @param conditional Can be a property that eventually gets set, oran expression, method... anything that can beevaluated.
    * @param context       OptionalThe namespace where the call originated.Defaults to global and anonymous functions
    * @param interval       OptionalPoll time to check conditional in Milliseconds
    */
  type doLater = js.Function3[
    /* conditional */ js.Any, 
    /* context */ js.UndefOr[js.Object], 
    /* interval */ js.UndefOr[Double], 
    Unit
  ]
}

