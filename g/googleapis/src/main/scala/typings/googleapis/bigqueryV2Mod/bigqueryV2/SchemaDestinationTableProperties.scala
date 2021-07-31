package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDestinationTableProperties extends StObject {
  
  /**
    * [Optional] The description for the destination table. This will only be
    * used if the destination table is newly created. If the table already
    * exists and a value different than the current description is provided,
    * the job will fail.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * [Optional] The friendly name for the destination table. This will only be
    * used if the destination table is newly created. If the table already
    * exists and a value different than the current friendly name is provided,
    * the job will fail.
    */
  var friendlyName: js.UndefOr[String] = js.undefined
  
  /**
    * [Optional] The labels associated with this table. You can use these to
    * organize and group your tables. This will only be used if the destination
    * table is newly created. If the table already exists and labels are
    * different than the current labels are provided, the job will fail.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.undefined
}
object SchemaDestinationTableProperties {
  
  @scala.inline
  def apply(): SchemaDestinationTableProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDestinationTableProperties]
  }
  
  @scala.inline
  implicit class SchemaDestinationTablePropertiesMutableBuilder[Self <: SchemaDestinationTableProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
    
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
  }
}
