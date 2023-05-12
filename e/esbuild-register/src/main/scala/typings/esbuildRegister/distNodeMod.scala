package typings.esbuildRegister

import typings.esbuild.mod.TransformOptions
import typings.esbuildRegister.anon.Unregister
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeMod {
  
  @JSImport("esbuild-register/dist/node", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def register(): Unregister = ^.asInstanceOf[js.Dynamic].applyDynamic("register")().asInstanceOf[Unregister]
  inline def register(esbuildOptions: RegisterOptions): Unregister = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(esbuildOptions.asInstanceOf[js.Any]).asInstanceOf[Unregister]
  
  type EXTENSIONS = /* keyof std.Record<string, esbuild-register.esbuild-register/dist/node.LOADERS> */ String
  
  /* Rewritten from type alias, can be one of: 
    - typings.esbuildRegister.esbuildRegisterStrings.js_
    - typings.esbuildRegister.esbuildRegisterStrings.jsx
    - typings.esbuildRegister.esbuildRegisterStrings.ts
    - typings.esbuildRegister.esbuildRegisterStrings.tsx
  */
  trait LOADERS extends StObject
  object LOADERS {
    
    inline def js_ : typings.esbuildRegister.esbuildRegisterStrings.js_ = "js".asInstanceOf[typings.esbuildRegister.esbuildRegisterStrings.js_]
    
    inline def jsx: typings.esbuildRegister.esbuildRegisterStrings.jsx = "jsx".asInstanceOf[typings.esbuildRegister.esbuildRegisterStrings.jsx]
    
    inline def ts: typings.esbuildRegister.esbuildRegisterStrings.ts = "ts".asInstanceOf[typings.esbuildRegister.esbuildRegisterStrings.ts]
    
    inline def tsx: typings.esbuildRegister.esbuildRegisterStrings.tsx = "tsx".asInstanceOf[typings.esbuildRegister.esbuildRegisterStrings.tsx]
  }
  
  trait RegisterOptions
    extends StObject
       with TransformOptions {
    
    var extensions: js.UndefOr[js.Array[EXTENSIONS]] = js.undefined
    
    /**
      * Auto-ignore node_modules. Independent of any matcher.
      * @default true
      */
    var hookIgnoreNodeModules: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A matcher function, will be called with path to a file. Should return truthy if the file should be hooked, falsy otherwise.
      */
    var hookMatcher: js.UndefOr[js.Function1[/* fileName */ String, Boolean]] = js.undefined
  }
  object RegisterOptions {
    
    inline def apply(): RegisterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RegisterOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RegisterOptions] (val x: Self) extends AnyVal {
      
      inline def setExtensions(value: js.Array[EXTENSIONS]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setExtensionsVarargs(value: EXTENSIONS*): Self = StObject.set(x, "extensions", js.Array(value*))
      
      inline def setHookIgnoreNodeModules(value: Boolean): Self = StObject.set(x, "hookIgnoreNodeModules", value.asInstanceOf[js.Any])
      
      inline def setHookIgnoreNodeModulesUndefined: Self = StObject.set(x, "hookIgnoreNodeModules", js.undefined)
      
      inline def setHookMatcher(value: /* fileName */ String => Boolean): Self = StObject.set(x, "hookMatcher", js.Any.fromFunction1(value))
      
      inline def setHookMatcherUndefined: Self = StObject.set(x, "hookMatcher", js.undefined)
    }
  }
  
  type Register_ = ReturnType[js.Function1[/* esbuildOptions */ js.UndefOr[RegisterOptions], Unregister]]
}
