package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration for the mutual Tls mode for peer authentication.
  */
@js.native
trait SchemaMutualTls extends js.Object {
  
  /**
    * Specifies if the server TLS is configured to be strict or permissive.
    * This field can be set to one of the following: STRICT: Client certificate
    * must be presented, connection is in TLS. PERMISSIVE: Client certificate
    * can be omitted, connection can be either plaintext or TLS.
    */
  var mode: js.UndefOr[String] = js.native
}
object SchemaMutualTls {
  
  @scala.inline
  def apply(): SchemaMutualTls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMutualTls]
  }
  
  @scala.inline
  implicit class SchemaMutualTlsOps[Self <: SchemaMutualTls] (val x: Self) extends AnyVal {
    
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
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
  }
}
