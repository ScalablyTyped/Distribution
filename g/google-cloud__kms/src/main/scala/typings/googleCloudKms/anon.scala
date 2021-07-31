package typings.googleCloudKms

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudKms.mod.v1.CryptoKeyVersion
import typings.googleCloudKms.mod.v1.CryptoKeyVersionTemplate
import typings.googleProtobuf.timestampPbMod.Timestamp.AsObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Clientemail extends StObject {
    
    var client_email: js.UndefOr[String] = js.undefined
    
    var private_key: js.UndefOr[String] = js.undefined
  }
  object Clientemail {
    
    @scala.inline
    def apply(): Clientemail = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Clientemail]
    }
    
    @scala.inline
    implicit class ClientemailMutableBuilder[Self <: Clientemail] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClient_email(value: String): Self = StObject.set(x, "client_email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClient_emailUndefined: Self = StObject.set(x, "client_email", js.undefined)
      
      @scala.inline
      def setPrivate_key(value: String): Self = StObject.set(x, "private_key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivate_keyUndefined: Self = StObject.set(x, "private_key", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@google-cloud/kms.@google-cloud/kms.v1.KeyRing> */
  trait PartialKeyRing extends StObject {
    
    var createTime: js.UndefOr[AsObject] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
  }
  object PartialKeyRing {
    
    @scala.inline
    def apply(): PartialKeyRing = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialKeyRing]
    }
    
    @scala.inline
    implicit class PartialKeyRingMutableBuilder[Self <: PartialKeyRing] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateTime(value: AsObject): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@google-cloud/kms.@google-cloud/kms.v1.Omit<@google-cloud/kms.@google-cloud/kms.v1.CryptoKey, 'purpose'>> & {  purpose :keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CryptoKeyPurpose * / any} */
  trait PartialOmitCryptoKeypurpo extends StObject {
    
    var createTime: js.UndefOr[AsObject] = js.undefined
    
    var labels: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var nextRotationTime: js.UndefOr[AsObject] = js.undefined
    
    var primary: js.UndefOr[CryptoKeyVersion] = js.undefined
    
    var purpose: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CryptoKeyPurpose * / any */ String
    
    var versionTemplate: js.UndefOr[CryptoKeyVersionTemplate] = js.undefined
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
    implicit class PartialOmitCryptoKeypurpoMutableBuilder[Self <: PartialOmitCryptoKeypurpo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateTime(value: AsObject): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
      
      @scala.inline
      def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNextRotationTime(value: AsObject): Self = StObject.set(x, "nextRotationTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextRotationTimeUndefined: Self = StObject.set(x, "nextRotationTime", js.undefined)
      
      @scala.inline
      def setPrimary(value: CryptoKeyVersion): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
      
      @scala.inline
      def setPurpose(
        value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CryptoKeyPurpose * / any */ String
      ): Self = StObject.set(x, "purpose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionTemplate(value: CryptoKeyVersionTemplate): Self = StObject.set(x, "versionTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionTemplateUndefined: Self = StObject.set(x, "versionTemplate", js.undefined)
    }
  }
}
