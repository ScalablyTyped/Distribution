package typings.googleapis.booksV1Mod.booksV1

import typings.googleapis.anon.BannerImageUrl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaSeries extends StObject {
  
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
  
  var series: js.UndefOr[js.Array[BannerImageUrl]] = js.native
}
object SchemaSeries {
  
  @scala.inline
  def apply(): SchemaSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSeries]
  }
  
  @scala.inline
  implicit class SchemaSeriesMutableBuilder[Self <: SchemaSeries] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setSeries(value: js.Array[BannerImageUrl]): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    @scala.inline
    def setSeriesVarargs(value: BannerImageUrl*): Self = StObject.set(x, "series", js.Array(value :_*))
  }
}
