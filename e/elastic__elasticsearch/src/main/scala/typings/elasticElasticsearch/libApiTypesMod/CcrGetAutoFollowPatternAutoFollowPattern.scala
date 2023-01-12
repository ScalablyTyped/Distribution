package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CcrGetAutoFollowPatternAutoFollowPattern extends StObject {
  
  var name: Name
  
  var pattern: CcrGetAutoFollowPatternAutoFollowPatternSummary
}
object CcrGetAutoFollowPatternAutoFollowPattern {
  
  inline def apply(name: Name, pattern: CcrGetAutoFollowPatternAutoFollowPatternSummary): CcrGetAutoFollowPatternAutoFollowPattern = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[CcrGetAutoFollowPatternAutoFollowPattern]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CcrGetAutoFollowPatternAutoFollowPattern] (val x: Self) extends AnyVal {
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPattern(value: CcrGetAutoFollowPatternAutoFollowPatternSummary): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
  }
}
