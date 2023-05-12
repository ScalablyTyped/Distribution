package typings.googleCloudSpanner.mod

import typings.googleCloudSpanner.buildSrcCodecMod.Field
import typings.googleCloudSpanner.buildSrcCodecMod.Json
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@google-cloud/spanner", "Struct")
@js.native
open class Struct ()
  extends typings.googleCloudSpanner.buildSrcCodecMod.Struct
/* static members */
object Struct {
  
  @JSImport("@google-cloud/spanner", "Struct")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Converts an array of fields to a struct.
    *
    * @private
    *
    * @param {object[]} fields List of struct fields.
    * @return {Struct}
    */
  inline def fromArray(fields: js.Array[Field]): typings.googleCloudSpanner.buildSrcCodecMod.Struct = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(fields.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.buildSrcCodecMod.Struct]
  
  /**
    * Converts a JSON object to a struct.
    *
    * @private
    *
    * @param {object} json Struct JSON.
    * @return {Struct}
    */
  inline def fromJSON(json: Json): typings.googleCloudSpanner.buildSrcCodecMod.Struct = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.buildSrcCodecMod.Struct]
}
