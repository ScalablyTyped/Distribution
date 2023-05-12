package typings.ethers

import typings.ethers.typesWordlistsWordlistMod.Wordlist
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesWordlistsLangZhMod {
  
  @JSImport("ethers/types/wordlists/lang-zh", "LangZh")
  @js.native
  open class LangZh protected () extends Wordlist {
    /**
      *  Creates a new instance of the Chinese language Wordlist for
      *  the %%dialect%%, either ``"cn"`` or ``"tw"`` for simplified
      *  or traditional, respectively.
      *
      *  This should be unnecessary most of the time as the exported
      *  [[langZhCn]] and [[langZhTw]] should suffice.
      *
      *  @_ignore:
      */
    def this(dialect: String) = this()
  }
  /* static members */
  object LangZh {
    
    @JSImport("ethers/types/wordlists/lang-zh", "LangZh")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      *  Returns a singleton instance of a ``LangZh`` for %%dialect%%,
      *  creating it if this is the first time being called.
      *
      *  Use the %%dialect%% ``"cn"`` or ``"tw"`` for simplified or
      *  traditional, respectively.
      */
    inline def wordlist(dialect: String): LangZh = ^.asInstanceOf[js.Dynamic].applyDynamic("wordlist")(dialect.asInstanceOf[js.Any]).asInstanceOf[LangZh]
  }
}
