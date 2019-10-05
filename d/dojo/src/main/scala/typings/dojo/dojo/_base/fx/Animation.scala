package typings.dojo.dojo._base.fx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A generic animation class that fires callbacks into its handlers
  * object at various states.
  * A generic animation class that fires callbacks into its handlers
  * object at various states. Nearly all dojo animation functions
  * return an instance of this method, usually without calling the
  * .play() method beforehand. Therefore, you will likely need to
  * call .play() on instances of Animation when one is
  * returned.
  *
  * @param args The 'magic argument', mixing all the properties into thisanimation instance.
  */
trait Animation extends js.Object

