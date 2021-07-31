package typings.gapiYoutube.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hl extends StObject {
  
  /**
    * The hl parameter specifies the language that should be used for text values in the API response.
    */
  var hl: js.UndefOr[String] = js.undefined
  
  /**
    * The id parameter specifies a comma-separated list of video category IDs for the resources that you are retrieving.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The part parameter specifies the videoCategory resource parts that the API response will include. Supported values are id and snippet.
    */
  var part: String
  
  /**
    * The regionCode parameter instructs the API to return the list of video categories available in the specified country. The parameter value is an ISO 3166-1 alpha-2 country code.
    */
  var regionCode: js.UndefOr[String] = js.undefined
}
object Hl {
  
  @scala.inline
  def apply(part: String): Hl = {
    val __obj = js.Dynamic.literal(part = part.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hl]
  }
  
  @scala.inline
  implicit class HlMutableBuilder[Self <: Hl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHl(value: String): Self = StObject.set(x, "hl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHlUndefined: Self = StObject.set(x, "hl", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setPart(value: String): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionCode(value: String): Self = StObject.set(x, "regionCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionCodeUndefined: Self = StObject.set(x, "regionCode", js.undefined)
  }
}
