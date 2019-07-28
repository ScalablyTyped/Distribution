package typings.fb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  def fbAsyncInit(): js.Any
}

object Window {
  @scala.inline
  def apply(fbAsyncInit: () => js.Any): Window = {
    val __obj = js.Dynamic.literal(fbAsyncInit = js.Any.fromFunction0(fbAsyncInit))
  
    __obj.asInstanceOf[Window]
  }
}

