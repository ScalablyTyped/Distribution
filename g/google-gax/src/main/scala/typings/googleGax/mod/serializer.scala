package typings.googleGax.mod

import typings.proto3JsonSerializer.buildSrcToproto3jsonMod.ToProto3JSONOptions
import typings.proto3JsonSerializer.buildSrcTypesMod.JSONValue
import typings.protobufjs.mod.Message
import typings.protobufjs.mod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serializer {
  
  @JSImport("google-gax", "serializer")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromProto3JSON(`type`: Type, json: JSONValue): Message[js.Object] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("fromProto3JSON")(`type`.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[Message[js.Object] | Null]
  
  inline def toProto3JSON(obj: Message[js.Object]): JSONValue = ^.asInstanceOf[js.Dynamic].applyDynamic("toProto3JSON")(obj.asInstanceOf[js.Any]).asInstanceOf[JSONValue]
  inline def toProto3JSON(obj: Message[js.Object], options: ToProto3JSONOptions): JSONValue = (^.asInstanceOf[js.Dynamic].applyDynamic("toProto3JSON")(obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[JSONValue]
}
