package typings.ethers.mod.ethers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("ethers", "ethers.Wordlist")
@js.native
open class Wordlist protected ()
  extends typings.ethers.typesEthersMod.Wordlist {
  /**
    *  Creates a new Wordlist instance.
    *
    *  Sub-classes MUST call this if they provide their own constructor,
    *  passing in the locale string of the language.
    *
    *  Generally there is no need to create instances of a Wordlist,
    *  since each language-specific Wordlist creates an instance and
    *  there is no state kept internally, so they are safe to share.
    */
  def this(locale: String) = this()
}
