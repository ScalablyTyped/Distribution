package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MigrationDeprecations
  extends StObject
     with Generic {
  
  var index: js.UndefOr[String] = js.undefined
}
object MigrationDeprecations {
  
  @scala.inline
  def apply(): MigrationDeprecations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MigrationDeprecations]
  }
  
  @scala.inline
  implicit class MigrationDeprecationsMutableBuilder[Self <: MigrationDeprecations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
  }
}
