package typings.ethers.typesProvidersMod

import typings.ethers.typesProvidersProviderMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("ethers/types/providers", "AbstractSigner")
@js.native
open class AbstractSigner[P /* <: Null | Provider */] ()
  extends typings.ethers.typesProvidersAbstractSignerMod.AbstractSigner[P] {
  def this(provider: P) = this()
}
