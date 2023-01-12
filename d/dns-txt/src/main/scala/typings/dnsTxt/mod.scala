package typings.dnsTxt

import org.scalablytyped.runtime.StringDictionary
import typings.dnsTxt.anon.Decode
import typings.dnsTxt.dnsTxtBooleans.`true`
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * A constructor function which can be called with an options object.
    *
    * @example
    * import dnsTxt = require('dns-txt');
    * const txt = dnsTxt();
    *
    * const obj = {
    *   foo: 1,
    *   bar: 2
    * }
    *
    * const enc = txt.encode(obj) // <Buffer 05 66 6f 6f 3d 31 05 62 61 72 3d 32>
    *
    * txt.decode(enc) // { foo: '1', bar: '2' }
    */
  inline def apply(): Decode = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Decode]
  inline def apply(opts: Options): Decode = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[Decode]
  
  @JSImport("dns-txt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type DataToEncode = StringDictionary[Boolean | String | Double | Buffer]
  
  type DecodedData = StringDictionary[`true` | String | Buffer]
  
  trait Options extends StObject {
    
    /**
      * If set to `true` all values will be returned as `Buffer`
      * objects. The default behavior is to turn all values into strings. But
      * according to the RFC the values can be any binary data. If you expect
      * binary data, use this option.
      *
      * @default false
      */
    var binary: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setBinary(value: Boolean): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
      
      inline def setBinaryUndefined: Self = StObject.set(x, "binary", js.undefined)
    }
  }
}
