package typings.ethers.mod

import typings.ethers.typesProvidersFormattingMod.BlockParams
import typings.ethers.typesProvidersProviderMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers", "Block")
@js.native
open class Block protected ()
  extends typings.ethers.typesEthersMod.Block {
  /**
    *  Create a new **Block** object.
    *
    *  This should generally not be necessary as the unless implementing a
    *  low-level library.
    */
  def this(block: BlockParams, provider: Provider) = this()
}
