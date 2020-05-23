package typings.fridaGum.global

import typings.fridaGum.NativeCallbackImplementation
import typings.fridaGum.NativeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("NativeCallback")
@js.native
class NativeCallback protected ()
  extends typings.fridaGum.NativePointer {
  def this(func: NativeCallbackImplementation, retType: NativeType, argTypes: js.Array[NativeType]) = this()
}

