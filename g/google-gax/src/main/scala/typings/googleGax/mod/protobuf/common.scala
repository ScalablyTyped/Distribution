package typings.googleGax.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.INamespace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object common {
  
  inline def apply(name: String, json: StringDictionary[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("google-gax", "protobuf.common")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Gets the root definition of the specified common proto file.
    *
    * Bundled definitions are:
    * - google/protobuf/any.proto
    * - google/protobuf/duration.proto
    * - google/protobuf/empty.proto
    * - google/protobuf/field_mask.proto
    * - google/protobuf/struct.proto
    * - google/protobuf/timestamp.proto
    * - google/protobuf/wrappers.proto
    *
    * @param file Proto file name
    * @returns Root definition or `null` if not defined
    */
  inline def get(file: String): INamespace | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(file.asInstanceOf[js.Any]).asInstanceOf[INamespace | Null]
}
