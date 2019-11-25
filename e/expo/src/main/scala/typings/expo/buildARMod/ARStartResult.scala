package typings.expo.buildARMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ARStartResult extends js.Object {
  var capturedImageTexture: Double
}

object ARStartResult {
  @scala.inline
  def apply(capturedImageTexture: Double): ARStartResult = {
    val __obj = js.Dynamic.literal(capturedImageTexture = capturedImageTexture.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ARStartResult]
  }
}

