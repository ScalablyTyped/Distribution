package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CcrGetAutoFollowPatternResponse extends StObject {
  
  var patterns: js.Array[CcrGetAutoFollowPatternAutoFollowPattern]
}
object CcrGetAutoFollowPatternResponse {
  
  inline def apply(patterns: js.Array[CcrGetAutoFollowPatternAutoFollowPattern]): CcrGetAutoFollowPatternResponse = {
    val __obj = js.Dynamic.literal(patterns = patterns.asInstanceOf[js.Any])
    __obj.asInstanceOf[CcrGetAutoFollowPatternResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CcrGetAutoFollowPatternResponse] (val x: Self) extends AnyVal {
    
    inline def setPatterns(value: js.Array[CcrGetAutoFollowPatternAutoFollowPattern]): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
    
    inline def setPatternsVarargs(value: CcrGetAutoFollowPatternAutoFollowPattern*): Self = StObject.set(x, "patterns", js.Array(value*))
  }
}
