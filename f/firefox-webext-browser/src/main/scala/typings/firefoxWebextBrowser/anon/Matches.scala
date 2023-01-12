package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.browser.manifest.MatchPatternRestricted
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Matches extends StObject {
  
  var matches: js.Array[MatchPatternRestricted]
  
  var resources: js.Array[String]
}
object Matches {
  
  inline def apply(matches: js.Array[MatchPatternRestricted], resources: js.Array[String]): Matches = {
    val __obj = js.Dynamic.literal(matches = matches.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[Matches]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Matches] (val x: Self) extends AnyVal {
    
    inline def setMatches(value: js.Array[MatchPatternRestricted]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
    
    inline def setMatchesVarargs(value: MatchPatternRestricted*): Self = StObject.set(x, "matches", js.Array(value*))
    
    inline def setResources(value: js.Array[String]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesVarargs(value: String*): Self = StObject.set(x, "resources", js.Array(value*))
  }
}
