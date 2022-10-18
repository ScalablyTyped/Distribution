package typings.ethersprojectProperties

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ethersproject/properties", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ethersproject/properties", "Description")
  @js.native
  open class Description[T] protected () extends StObject {
    def this(info: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K]} */ js.Any) = this()
  }
  
  inline def checkProperties(`object`: Any, properties: StringDictionary[Boolean]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkProperties")(`object`.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def deepCopy[T](`object`: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("deepCopy")(`object`.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def defineReadOnly[T, K /* <: /* keyof T */ String */](
    `object`: T,
    name: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineReadOnly")(`object`.asInstanceOf[js.Any], name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getStatic[T](ctor: Any, key: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("getStatic")(ctor.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def resolveProperties[T](`object`: Deferrable[T]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveProperties")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  
  inline def shallowCopy[T](`object`: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("shallowCopy")(`object`.asInstanceOf[js.Any]).asInstanceOf[T]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof T ]: T[K] | std.Promise<T[K]>}
    }}}
    */
  @js.native
  trait Deferrable[T] extends StObject
}
