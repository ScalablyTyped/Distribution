package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The web app details for an enterprise.
  */
@js.native
trait SchemaWebAppsListResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#webAppsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The manifest describing a web app.
    */
  var webApp: js.UndefOr[js.Array[SchemaWebApp]] = js.native
}

object SchemaWebAppsListResponse {
  @scala.inline
  def apply(): SchemaWebAppsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWebAppsListResponse]
  }
  @scala.inline
  implicit class SchemaWebAppsListResponseOps[Self <: SchemaWebAppsListResponse] (val x: Self) extends AnyVal {
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setWebAppVarargs(value: SchemaWebApp*): Self = this.set("webApp", js.Array(value :_*))
    @scala.inline
    def setWebApp(value: js.Array[SchemaWebApp]): Self = this.set("webApp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebApp: Self = this.set("webApp", js.undefined)
  }
  
}

