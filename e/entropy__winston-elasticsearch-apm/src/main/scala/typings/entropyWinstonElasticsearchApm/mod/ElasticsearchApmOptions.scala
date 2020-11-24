package typings.entropyWinstonElasticsearchApm.mod

import typings.entropyWinstonElasticsearchApm.anon.readonlyAwsLambdareadonly
import typings.winstonTransport.mod.TransportStreamOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElasticsearchApmOptions extends TransportStreamOptions {
  
  var apm: readonlyAwsLambdareadonly = js.native
}
object ElasticsearchApmOptions {
  
  @scala.inline
  def apply(apm: readonlyAwsLambdareadonly): ElasticsearchApmOptions = {
    val __obj = js.Dynamic.literal(apm = apm.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElasticsearchApmOptions]
  }
  
  @scala.inline
  implicit class ElasticsearchApmOptionsOps[Self <: ElasticsearchApmOptions] (val x: Self) extends AnyVal {
    
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
    def setApm(value: readonlyAwsLambdareadonly): Self = this.set("apm", value.asInstanceOf[js.Any])
  }
}
