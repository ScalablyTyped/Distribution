package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MlExplainDataFrameAnalytics[T] extends Generic {
  
  var body: js.UndefOr[T] = js.native
  
  var id: js.UndefOr[String] = js.native
}
object MlExplainDataFrameAnalytics {
  
  @scala.inline
  def apply[T](): MlExplainDataFrameAnalytics[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlExplainDataFrameAnalytics[T]]
  }
  
  @scala.inline
  implicit class MlExplainDataFrameAnalyticsOps[Self <: MlExplainDataFrameAnalytics[_], T] (val x: Self with MlExplainDataFrameAnalytics[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBody(value: T): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
  }
}
