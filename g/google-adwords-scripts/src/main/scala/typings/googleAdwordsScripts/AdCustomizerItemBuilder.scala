package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdCustomizerItemBuilder[AdCustomizerItem]
  extends StObject
     with AdWordsBuilder[AdCustomizerItem]
     with hasMobilePreferredBuilder[AdCustomizerItemBuilder[AdCustomizerItem]]
     with hasSchedulesBuilder[AdCustomizerItemBuilder[AdCustomizerItem]]
     with hasStartAndEndDateBuilder[AdCustomizerItemBuilder[AdCustomizerItem]] {
  
  def withAttributeValue(name: String, value: js.Object): AdCustomizerItemBuilder[AdCustomizerItem] = js.native
  
  def withAttributeValues(attributeValues: js.Object): AdCustomizerItemBuilder[AdCustomizerItem] = js.native
  
  def withTargetAdGroup(campaignName: String, adGroup: String): AdCustomizerItemBuilder[AdCustomizerItem] = js.native
  
  def withTargetCampaign(campaignName: String): AdCustomizerItemBuilder[AdCustomizerItem] = js.native
  
  def withTargetKeyword(keyword: String): AdCustomizerItemBuilder[AdCustomizerItem] = js.native
}
