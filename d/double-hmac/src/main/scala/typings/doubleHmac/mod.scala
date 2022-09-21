package typings.doubleHmac

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Compare two Buffers using Double HMAC to protect against timing attacks.
    *
    * @example
    * import * as assert from 'assert'
    * import compare = require('double-hmac')
    *
    * const a = Buffer.from('some string')
    * const b = Buffer.from('some other string')
    * const c = Buffer.from('some string')
    *
    * compare(a, b, (err, equal) => {
    *   assert.ifError(err)
    *   assert.ok(!equal)
    * })
    *
    * compare(a, c, (err, equal) => {
    *   assert.ifError(err)
    *   assert.ok(equal)
    * })
    */
  inline def apply(a: Buffer, b: Buffer, cb: js.Function2[/* err */ js.Error | Null, /* equal */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].apply(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("double-hmac", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
