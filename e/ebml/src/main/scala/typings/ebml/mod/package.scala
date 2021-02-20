package typings.ebml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type StateAndTagData = js.Tuple2[
    typings.ebml.ebmlStrings.tag | typings.ebml.ebmlStrings.start | typings.ebml.ebmlStrings.end, 
    typings.ebml.mod.Tag[js.Any] | typings.ebml.mod.TagMetadata
  ]
  
  @scala.inline
  def schema: typings.std.Map[scala.Double, typings.ebml.mod.EBMLTagSchema] = typings.ebml.mod.^.asInstanceOf[js.Dynamic].selectDynamic("schema").asInstanceOf[typings.std.Map[scala.Double, typings.ebml.mod.EBMLTagSchema]]
}
