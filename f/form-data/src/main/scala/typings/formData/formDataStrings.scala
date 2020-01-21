package typings.formData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object formDataStrings {
  @js.native
  sealed trait httpColon extends js.Object
  
  @js.native
  sealed trait httpsColon extends js.Object
  
  @scala.inline
  def httpColon: httpColon = "http:".asInstanceOf[httpColon]
  @scala.inline
  def httpsColon: httpsColon = "https:".asInstanceOf[httpsColon]
}

