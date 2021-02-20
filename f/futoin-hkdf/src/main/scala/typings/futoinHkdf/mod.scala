package typings.futoinHkdf

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("futoin-hkdf", JSImport.Namespace)
  @js.native
  def apply(ikm: String, length: Double): Buffer = js.native
  @JSImport("futoin-hkdf", JSImport.Namespace)
  @js.native
  def apply(ikm: String, length: Double, option: Options): Buffer = js.native
  @JSImport("futoin-hkdf", JSImport.Namespace)
  @js.native
  def apply(ikm: Buffer, length: Double): Buffer = js.native
  @JSImport("futoin-hkdf", JSImport.Namespace)
  @js.native
  def apply(ikm: Buffer, length: Double, option: Options): Buffer = js.native
  
  @JSImport("futoin-hkdf", "expand")
  @js.native
  def expand(hash: String, hash_len: Double, prk: String, length: Double, info: String): Buffer = js.native
  @JSImport("futoin-hkdf", "expand")
  @js.native
  def expand(hash: String, hash_len: Double, prk: String, length: Double, info: Buffer): Buffer = js.native
  @JSImport("futoin-hkdf", "expand")
  @js.native
  def expand(hash: String, hash_len: Double, prk: Buffer, length: Double, info: String): Buffer = js.native
  @JSImport("futoin-hkdf", "expand")
  @js.native
  def expand(hash: String, hash_len: Double, prk: Buffer, length: Double, info: Buffer): Buffer = js.native
  
  @JSImport("futoin-hkdf", "extract")
  @js.native
  def extract(hash: String, hash_len: Double, ikm: String, salt: String): Buffer = js.native
  @JSImport("futoin-hkdf", "extract")
  @js.native
  def extract(hash: String, hash_len: Double, ikm: String, salt: Buffer): Buffer = js.native
  @JSImport("futoin-hkdf", "extract")
  @js.native
  def extract(hash: String, hash_len: Double, ikm: Buffer, salt: String): Buffer = js.native
  @JSImport("futoin-hkdf", "extract")
  @js.native
  def extract(hash: String, hash_len: Double, ikm: Buffer, salt: Buffer): Buffer = js.native
  
  @JSImport("futoin-hkdf", "hash_length")
  @js.native
  def hashLength(hash: String): Double = js.native
  
  @js.native
  trait Options extends StObject {
    
    var hash: js.UndefOr[String] = js.native
    
    var info: js.UndefOr[Buffer | String] = js.native
    
    var salt: js.UndefOr[Buffer | String] = js.native
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
      def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      @scala.inline
      def setInfo(value: Buffer | String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      @scala.inline
      def setSalt(value: Buffer | String): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaltUndefined: Self = StObject.set(x, "salt", js.undefined)
    }
  }
}
