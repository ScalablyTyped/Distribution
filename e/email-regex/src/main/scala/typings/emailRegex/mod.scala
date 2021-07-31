package typings.emailRegex

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  Regular expression for matching email addresses.
  Use it for finding email addresses or checking if something is email like. [You shouldn't use this for validating emails.](http://davidcel.is/blog/2012/09/06/stop-validating-email-addresses-with-regex/) Only for hinting to the user.
  @example
  ```
  import emailRegex = require('email-regex');
  // Contains an email address
  emailRegex().test('unicorn sindresorhus@gmail.com');
  //=> true
  // Is an email address
  emailRegex({exact: true}).test('sindresorhus@gmail.com');
  //=> true
  'unicorn sindresorhus@gmail.com cake john@doe.com rainbow'.match(emailRegex());
  //=> ['sindresorhus@gmail.com', 'john@doe.com']
  ```
  */
  @scala.inline
  def apply(): RegExp = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[RegExp]
  @scala.inline
  def apply(options: Options): RegExp = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[RegExp]
  
  @JSImport("email-regex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /**
    		Only match an exact string.
    		Useful with `RegExp#test` to check if a string is an email address.
    		@default false
    		*/
    var exact: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExact(value: Boolean): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
    }
  }
}
