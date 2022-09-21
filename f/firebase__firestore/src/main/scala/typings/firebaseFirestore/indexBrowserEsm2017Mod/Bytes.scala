package typings.firebaseFirestore.indexBrowserEsm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/lite/packages/firestore/dist/lite/index.browser.esm2017", "Bytes")
@js.native
open class Bytes protected ()
  extends StObject
     with In {
  /** @hideconstructor */
  def this(t: Any) = this()
  
  /* CompleteClass */
  var _byteString: Any = js.native
  
  /**
    * Returns true if this `Bytes` object is equal to the provided one.
    *
    * @param other - The `Bytes` object to compare against.
    * @returns true if this `Bytes` object is equal to the provided one.
    */ /* CompleteClass */
  override def isEqual(t: Any): Any = js.native
  
  /**
    * Returns the underlying bytes as a Base64-encoded string.
    *
    * @returns The Base64-encoded string created from the `Bytes` object.
    */ /* CompleteClass */
  override def toBase64(): Any = js.native
  
  /**
    * Returns the underlying bytes in a new `Uint8Array`.
    *
    * @returns The Uint8Array created from the `Bytes` object.
    */ /* CompleteClass */
  override def toUint8Array(): Any = js.native
}
object Bytes {
  
  @JSImport("@firebase/firestore/dist/lite/packages/firestore/dist/lite/index.browser.esm2017", "Bytes")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new `Bytes` object from the given Base64 string, converting it to
    * bytes.
    *
    * @param base64 - The Base64 string used to create the `Bytes` object.
    */ /* static member */
  inline def fromBase64String(t: Any): In = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBase64String")(t.asInstanceOf[js.Any]).asInstanceOf[In]
  
  /**
    * Creates a new `Bytes` object from the given Uint8Array.
    *
    * @param array - The Uint8Array used to create the `Bytes` object.
    */ /* static member */
  inline def fromUint8Array(t: Any): In = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUint8Array")(t.asInstanceOf[js.Any]).asInstanceOf[In]
}
