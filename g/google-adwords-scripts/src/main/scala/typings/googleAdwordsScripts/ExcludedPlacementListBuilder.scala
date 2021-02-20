package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExcludedPlacementListBuilder[ExcludedPlacementList] extends AdWordsBuilder[ExcludedPlacementList] {
  
  def withName(name: String): ExcludedPlacementListBuilder[ExcludedPlacementList] = js.native
}
object ExcludedPlacementListBuilder {
  
  @scala.inline
  def apply[ExcludedPlacementList](
    build: () => AdWordsOperation[ExcludedPlacementList],
    withName: String => ExcludedPlacementListBuilder[ExcludedPlacementList]
  ): ExcludedPlacementListBuilder[ExcludedPlacementList] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), withName = js.Any.fromFunction1(withName))
    __obj.asInstanceOf[ExcludedPlacementListBuilder[ExcludedPlacementList]]
  }
  
  @scala.inline
  implicit class ExcludedPlacementListBuilderMutableBuilder[Self <: ExcludedPlacementListBuilder[_], ExcludedPlacementList] (val x: Self with ExcludedPlacementListBuilder[ExcludedPlacementList]) extends AnyVal {
    
    @scala.inline
    def setWithName(value: String => ExcludedPlacementListBuilder[ExcludedPlacementList]): Self = StObject.set(x, "withName", js.Any.fromFunction1(value))
  }
}
