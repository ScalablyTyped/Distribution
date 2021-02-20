package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MlGetDatafeeds extends Generic {
  
  var allow_no_datafeeds: js.UndefOr[Boolean] = js.native
  
  var allow_no_match: js.UndefOr[Boolean] = js.native
  
  var datafeed_id: js.UndefOr[String] = js.native
}
object MlGetDatafeeds {
  
  @scala.inline
  def apply(): MlGetDatafeeds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlGetDatafeeds]
  }
  
  @scala.inline
  implicit class MlGetDatafeedsMutableBuilder[Self <: MlGetDatafeeds] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllow_no_datafeeds(value: Boolean): Self = StObject.set(x, "allow_no_datafeeds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllow_no_datafeedsUndefined: Self = StObject.set(x, "allow_no_datafeeds", js.undefined)
    
    @scala.inline
    def setAllow_no_match(value: Boolean): Self = StObject.set(x, "allow_no_match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllow_no_matchUndefined: Self = StObject.set(x, "allow_no_match", js.undefined)
    
    @scala.inline
    def setDatafeed_id(value: String): Self = StObject.set(x, "datafeed_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatafeed_idUndefined: Self = StObject.set(x, "datafeed_id", js.undefined)
  }
}
