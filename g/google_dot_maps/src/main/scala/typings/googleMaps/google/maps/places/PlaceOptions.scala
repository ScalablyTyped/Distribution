package typings.googleMaps.google.maps.places

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaceOptions extends StObject {
  
  /**
    * The unique place id.
    */
  var id: String
  
  /**
    * A language identifier for the language in which details should be
    * returned. See the <a
    * href="https://developers.google.com/maps/faq#languagesupport">list of
    * supported languages</a>.
    */
  var requestedLanguage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A region code of the user&#39;s region. This can affect which photos may
    * be returned, and possibly other things. The region code accepts a <a
    * href="https://en.wikipedia.org/wiki/List_of_Internet_top-level_domains#Country_code_top-level_domains">ccTLD
    * (&quot;top-level domain&quot;)</a> two-character value. Most ccTLD codes
    * are identical to ISO 3166-1 codes, with some notable exceptions. For
    * example, the United Kingdom&#39;s ccTLD is &quot;uk&quot;
    * (<code>.co.uk</code>) while its ISO 3166-1 code is &quot;gb&quot;
    * (technically for the entity of &quot;The United Kingdom of Great Britain
    * and Northern Ireland&quot;).
    */
  var requestedRegion: js.UndefOr[String | Null] = js.undefined
}
object PlaceOptions {
  
  inline def apply(id: String): PlaceOptions = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaceOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlaceOptions] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setRequestedLanguage(value: String): Self = StObject.set(x, "requestedLanguage", value.asInstanceOf[js.Any])
    
    inline def setRequestedLanguageNull: Self = StObject.set(x, "requestedLanguage", null)
    
    inline def setRequestedLanguageUndefined: Self = StObject.set(x, "requestedLanguage", js.undefined)
    
    inline def setRequestedRegion(value: String): Self = StObject.set(x, "requestedRegion", value.asInstanceOf[js.Any])
    
    inline def setRequestedRegionNull: Self = StObject.set(x, "requestedRegion", null)
    
    inline def setRequestedRegionUndefined: Self = StObject.set(x, "requestedRegion", js.undefined)
  }
}
