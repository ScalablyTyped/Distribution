package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlacementBuilder[Placement]
  extends StObject
     with DisplayBuilder[PlacementBuilder[Placement]] {
  
  def withUrl(url: String): PlacementBuilder[Placement]
}
object PlacementBuilder {
  
  @scala.inline
  def apply[Placement](
    build: () => AdWordsOperation[PlacementBuilder[Placement]],
    exclude: () => AdWordsOperation[PlacementBuilder[Placement]],
    withCpc: Double => PlacementBuilder[Placement],
    withCpm: Double => PlacementBuilder[Placement],
    withUrl: String => PlacementBuilder[Placement]
  ): PlacementBuilder[Placement] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), exclude = js.Any.fromFunction0(exclude), withCpc = js.Any.fromFunction1(withCpc), withCpm = js.Any.fromFunction1(withCpm), withUrl = js.Any.fromFunction1(withUrl))
    __obj.asInstanceOf[PlacementBuilder[Placement]]
  }
  
  @scala.inline
  implicit class PlacementBuilderMutableBuilder[Self <: PlacementBuilder[?], Placement] (val x: Self & PlacementBuilder[Placement]) extends AnyVal {
    
    @scala.inline
    def setWithUrl(value: String => PlacementBuilder[Placement]): Self = StObject.set(x, "withUrl", js.Any.fromFunction1(value))
  }
}
