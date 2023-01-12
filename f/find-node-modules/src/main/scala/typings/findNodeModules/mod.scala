package typings.findNodeModules

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Return an array of all parent node_modules directories
    *
    * @example
    * import findNodeModules from 'find-node-modules';
    *
    * findNodeModules();
    * //=> ['node_modules', '../../node_modules']
    *
    * findNodeModules({ cwd: './someDir' });
    * //=> ['../node_modules', '../../../node_modules']
    *
    * findNodeModules('./someDir');
    * //=> ['../node_modules', '../../../node_modules']
    *
    * findNodeModules({ cwd: './someDir', relative: false });
    * //=> ['/path/to/something/node_modules', '/path/node_modules']
    */
  inline def apply(): js.Array[String] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Array[String]]
  inline def apply(options: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def apply(options: Options): js.Array[String] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  @JSImport("find-node-modules", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /**
      * The directory to start the search from
      *
      * @default process.cwd()
      */
    var cwd: js.UndefOr[String] = js.undefined
    
    /**
      * If false, returns absolute paths
      *
      * @default true
      */
    var relative: js.UndefOr[Boolean] = js.undefined
    
    /**
      * What directory to search for
      *
      * @default 'node_modules'
      */
    var searchFor: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setRelative(value: Boolean): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
      
      inline def setRelativeUndefined: Self = StObject.set(x, "relative", js.undefined)
      
      inline def setSearchFor(value: String): Self = StObject.set(x, "searchFor", value.asInstanceOf[js.Any])
      
      inline def setSearchForUndefined: Self = StObject.set(x, "searchFor", js.undefined)
    }
  }
}
