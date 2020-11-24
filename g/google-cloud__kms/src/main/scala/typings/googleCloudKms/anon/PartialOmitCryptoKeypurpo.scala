package typings.googleCloudKms.anon

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudKms.mod.v1.CryptoKeyVersion
import typings.googleCloudKms.mod.v1.CryptoKeyVersionTemplate
import typings.googleProtobuf.timestampPbMod.Timestamp.AsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@google-cloud/kms.@google-cloud/kms.v1.Omit<@google-cloud/kms.@google-cloud/kms.v1.CryptoKey, 'purpose'>> & {  purpose :keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CryptoKeyPurpose * / any} */
@js.native
trait PartialOmitCryptoKeypurpo extends js.Object {
  
  var createTime: js.UndefOr[AsObject] = js.native
  
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var nextRotationTime: js.UndefOr[AsObject] = js.native
  
  var primary: js.UndefOr[CryptoKeyVersion] = js.native
  
  var purpose: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CryptoKeyPurpose * / any */ String = js.native
  
  var versionTemplate: js.UndefOr[CryptoKeyVersionTemplate] = js.native
}
object PartialOmitCryptoKeypurpo {
  
  @scala.inline
  def apply(
    purpose: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CryptoKeyPurpose * / any */ String
  ): PartialOmitCryptoKeypurpo = {
    val __obj = js.Dynamic.literal(purpose = purpose.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialOmitCryptoKeypurpo]
  }
  
  @scala.inline
  implicit class PartialOmitCryptoKeypurpoOps[Self <: PartialOmitCryptoKeypurpo] (val x: Self) extends AnyVal {
    
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
    def setPurpose(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CryptoKeyPurpose * / any */ String
    ): Self = this.set("purpose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTime(value: AsObject): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNextRotationTime(value: AsObject): Self = this.set("nextRotationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextRotationTime: Self = this.set("nextRotationTime", js.undefined)
    
    @scala.inline
    def setPrimary(value: CryptoKeyVersion): Self = this.set("primary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimary: Self = this.set("primary", js.undefined)
    
    @scala.inline
    def setVersionTemplate(value: CryptoKeyVersionTemplate): Self = this.set("versionTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionTemplate: Self = this.set("versionTemplate", js.undefined)
  }
}
