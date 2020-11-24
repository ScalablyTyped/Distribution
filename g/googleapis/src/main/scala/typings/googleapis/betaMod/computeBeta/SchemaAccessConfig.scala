package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An access configuration attached to an instance&#39;s network interface.
  * Only one access config per instance is supported.
  */
@js.native
trait SchemaAccessConfig extends js.Object {
  
  /**
    * [Output Only] Type of the resource. Always compute#accessConfig for
    * access configs.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The name of this access configuration. The default and recommended name
    * is External NAT but you can use any arbitrary string you would like. For
    * example, My external IP or Network Access.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * An external IP address associated with this instance. Specify an unused
    * static external IP address available to the project or leave this field
    * undefined to use an IP from a shared ephemeral IP address pool. If you
    * specify a static external IP address, it must live in the same region as
    * the zone of the instance.
    */
  var natIP: js.UndefOr[String] = js.native
  
  /**
    * This signifies the networking tier used for configuring this access
    * configuration and can only take the following values: PREMIUM, STANDARD.
    * If an AccessConfig is specified without a valid external IP address, an
    * ephemeral IP will be created with this networkTier.  If an AccessConfig
    * with a valid external IP address is specified, it must match that of the
    * networkTier associated with the Address resource owning that IP.
    */
  var networkTier: js.UndefOr[String] = js.native
  
  /**
    * The DNS domain name for the public PTR record. This field can only be set
    * when the set_public_ptr field is enabled.
    */
  var publicPtrDomainName: js.UndefOr[String] = js.native
  
  /**
    * Specifies whether a public DNS ?PTR? record should be created to map the
    * external IP address of the instance to a DNS domain name.
    */
  var setPublicPtr: js.UndefOr[Boolean] = js.native
  
  /**
    * The type of configuration. The default and only option is ONE_TO_ONE_NAT.
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaAccessConfig {
  
  @scala.inline
  def apply(): SchemaAccessConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccessConfig]
  }
  
  @scala.inline
  implicit class SchemaAccessConfigOps[Self <: SchemaAccessConfig] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNatIP(value: String): Self = this.set("natIP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNatIP: Self = this.set("natIP", js.undefined)
    
    @scala.inline
    def setNetworkTier(value: String): Self = this.set("networkTier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkTier: Self = this.set("networkTier", js.undefined)
    
    @scala.inline
    def setPublicPtrDomainName(value: String): Self = this.set("publicPtrDomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicPtrDomainName: Self = this.set("publicPtrDomainName", js.undefined)
    
    @scala.inline
    def setSetPublicPtr(value: Boolean): Self = this.set("setPublicPtr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetPublicPtr: Self = this.set("setPublicPtr", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
