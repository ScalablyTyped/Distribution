package typings.geetest

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("geetest", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with Geetest {
    def this(options: Options) = this()
  }
  
  trait Data extends StObject {
    
    var challenge: String
    
    var geetest_id: String
    
    var gt: String
    
    var new_captcha: String
    
    var success: Success
  }
  object Data {
    
    @scala.inline
    def apply(challenge: String, geetest_id: String, gt: String, new_captcha: String, success: Success): Data = {
      val __obj = js.Dynamic.literal(challenge = challenge.asInstanceOf[js.Any], geetest_id = geetest_id.asInstanceOf[js.Any], gt = gt.asInstanceOf[js.Any], new_captcha = new_captcha.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChallenge(value: String): Self = StObject.set(x, "challenge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeetest_id(value: String): Self = StObject.set(x, "geetest_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGt(value: String): Self = StObject.set(x, "gt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNew_captcha(value: String): Self = StObject.set(x, "new_captcha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccess(value: Success): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Geetest extends StObject {
    
    def register(): js.Promise[Data] = js.native
    def register(callback: js.Function2[/* error */ Error, /* data */ Data, Unit]): Unit = js.native
    
    def validate(result: Result): js.Promise[Success] = js.native
    def validate(result: Result, callback: js.Function2[/* error */ Error, /* success */ Success, Unit]): Unit = js.native
  }
  
  trait Options extends StObject {
    
    var api_server: js.UndefOr[String] = js.undefined
    
    var geetest_id: String
    
    var geetest_key: String
    
    var protocol: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(geetest_id: String, geetest_key: String): Options = {
      val __obj = js.Dynamic.literal(geetest_id = geetest_id.asInstanceOf[js.Any], geetest_key = geetest_key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApi_server(value: String): Self = StObject.set(x, "api_server", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApi_serverUndefined: Self = StObject.set(x, "api_server", js.undefined)
      
      @scala.inline
      def setGeetest_id(value: String): Self = StObject.set(x, "geetest_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeetest_key(value: String): Self = StObject.set(x, "geetest_key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    }
  }
  
  trait Result extends StObject {
    
    var challenge: String
    
    var seccode: String
    
    var validate: String
  }
  object Result {
    
    @scala.inline
    def apply(challenge: String, seccode: String, validate: String): Result = {
      val __obj = js.Dynamic.literal(challenge = challenge.asInstanceOf[js.Any], seccode = seccode.asInstanceOf[js.Any], validate = validate.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    @scala.inline
    implicit class ResultMutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChallenge(value: String): Self = StObject.set(x, "challenge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeccode(value: String): Self = StObject.set(x, "seccode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidate(value: String): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.geetest.geetestNumbers.`0`
    - typings.geetest.geetestNumbers.`1`
  */
  trait Success extends StObject
  object Success {
    
    @scala.inline
    def `0`: typings.geetest.geetestNumbers.`0` = 0.asInstanceOf[typings.geetest.geetestNumbers.`0`]
    
    @scala.inline
    def `1`: typings.geetest.geetestNumbers.`1` = 1.asInstanceOf[typings.geetest.geetestNumbers.`1`]
  }
}
