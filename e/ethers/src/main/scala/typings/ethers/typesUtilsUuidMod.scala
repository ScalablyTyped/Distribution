package typings.ethers

import typings.ethers.typesUtilsDataMod.BytesLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUtilsUuidMod {
  
  @JSImport("ethers/types/utils/uuid", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def uuidV4(randomBytes: BytesLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("uuidV4")(randomBytes.asInstanceOf[js.Any]).asInstanceOf[String]
}
