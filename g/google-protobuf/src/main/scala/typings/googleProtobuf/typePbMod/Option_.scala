package typings.googleProtobuf.typePbMod

import typings.googleProtobuf.anyPbMod.Any
import typings.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-protobuf/google/protobuf/type_pb", "Option")
@js.native
class Option_ () extends Message {
  
  def clearValue(): Option = js.native
  
  def getName(): String = js.native
  
  def getValue(): js.UndefOr[Any] = js.native
  
  def hasValue(): Boolean = js.native
  
  def setName(value: String): Option = js.native
  
  def setValue(): Option = js.native
  def setValue(value: Any): Option = js.native
}
