package typings.fkill

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fkill", JSImport.Namespace)
  @js.native
  def apply(input: String): js.Promise[Unit] = js.native
  @JSImport("fkill", JSImport.Namespace)
  @js.native
  def apply(input: String, options: Options): js.Promise[Unit] = js.native
  @JSImport("fkill", JSImport.Namespace)
  @js.native
  def apply(input: js.Array[String | Double]): js.Promise[Unit] = js.native
  @JSImport("fkill", JSImport.Namespace)
  @js.native
  def apply(input: js.Array[String | Double], options: Options): js.Promise[Unit] = js.native
  /**
  Fabulously kill processes. Cross-platform.
  @param input - One or more process IDs/names/ports to kill. To kill a port, prefix it with a colon. For example: `:8080`.
  @example
  ```
  import fkill = require('fkill');
  (async () => {
  	await fkill(1337);
  	console.log('Killed process');
  })();
  fkill('Safari');
  fkill(':8080');
  fkill([1337, 'Safari', ':8080']);
  ```
  */
  @JSImport("fkill", JSImport.Namespace)
  @js.native
  def apply(input: Double): js.Promise[Unit] = js.native
  @JSImport("fkill", JSImport.Namespace)
  @js.native
  def apply(input: Double, options: Options): js.Promise[Unit] = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
    		Force kill the process.
    		@default false
    		*/
    val force: js.UndefOr[Boolean] = js.native
    
    /**
    		Ignore capitalization when killing a process.
    		Note that the case is always ignored on Windows.
    		@default false
    		*/
    val ignoreCase: js.UndefOr[Boolean] = js.native
    
    /**
    		Kill all child processes along with the parent process. _(Windows only)_
    		@default true
    		*/
    val tree: js.UndefOr[Boolean] = js.native
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
      def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
      
      @scala.inline
      def setIgnoreCase(value: Boolean): Self = StObject.set(x, "ignoreCase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreCaseUndefined: Self = StObject.set(x, "ignoreCase", js.undefined)
      
      @scala.inline
      def setTree(value: Boolean): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeUndefined: Self = StObject.set(x, "tree", js.undefined)
    }
  }
}
