package typings.googleAuthLibrary

import typings.gaxios.buildSrcCommonMod.GaxiosOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcAuthAwsrequestsignerMod {
  
  @JSImport("google-auth-library/build/src/auth/awsrequestsigner", "AwsRequestSigner")
  @js.native
  open class AwsRequestSigner protected () extends StObject {
    /**
      * Instantiates an AWS API request signer used to send authenticated signed
      * requests to AWS APIs based on the AWS Signature Version 4 signing process.
      * This also provides a mechanism to generate the signed request without
      * sending it.
      * @param getCredentials A mechanism to retrieve AWS security credentials
      *   when needed.
      * @param region The AWS region to use.
      */
    def this(getCredentials: js.Function0[js.Promise[AwsSecurityCredentials]], region: String) = this()
    
    /* private */ val crypto: Any = js.native
    
    /* private */ val getCredentials: Any = js.native
    
    /**
      * Generates the signed request for the provided HTTP request for calling
      * an AWS API. This follows the steps described at:
      * https://docs.aws.amazon.com/general/latest/gr/sigv4_signing.html
      * @param amzOptions The AWS request options that need to be signed.
      * @return A promise that resolves with the GaxiosOptions containing the
      *   signed HTTP request parameters.
      */
    def getRequestOptions(amzOptions: GaxiosOptions): js.Promise[GaxiosOptions] = js.native
    
    /* private */ val region: Any = js.native
  }
  
  trait AwsSecurityCredentials extends StObject {
    
    var accessKeyId: String
    
    var secretAccessKey: String
    
    var token: js.UndefOr[String] = js.undefined
  }
  object AwsSecurityCredentials {
    
    inline def apply(accessKeyId: String, secretAccessKey: String): AwsSecurityCredentials = {
      val __obj = js.Dynamic.literal(accessKeyId = accessKeyId.asInstanceOf[js.Any], secretAccessKey = secretAccessKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[AwsSecurityCredentials]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AwsSecurityCredentials] (val x: Self) extends AnyVal {
      
      inline def setAccessKeyId(value: String): Self = StObject.set(x, "accessKeyId", value.asInstanceOf[js.Any])
      
      inline def setSecretAccessKey(value: String): Self = StObject.set(x, "secretAccessKey", value.asInstanceOf[js.Any])
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    }
  }
}
