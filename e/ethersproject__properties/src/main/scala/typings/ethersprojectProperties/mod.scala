package typings.ethersprojectProperties

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ethersproject/properties", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ethersproject/properties", "Description")
  @js.native
  class Description[T] protected () extends StObject {
    def this(info: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof T ]: T[K]}
      */ typings.ethersprojectProperties.ethersprojectPropertiesStrings.Description & TopLevel[T]) = this()
  }
  
  @scala.inline
  def checkProperties(`object`: js.Any, properties: StringDictionary[Boolean]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkProperties")(`object`.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def deepCopy[T](`object`: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("deepCopy")(`object`.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def defineReadOnly[T, K /* <: /* keyof T */ String */](
    `object`: T,
    name: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineReadOnly")(`object`.asInstanceOf[js.Any], name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def getStatic[T](ctor: js.Any, key: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("getStatic")(ctor.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def resolveProperties[T](`object`: Deferrable[T]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveProperties")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  
  @scala.inline
  def shallowCopy[T](`object`: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("shallowCopy")(`object`.asInstanceOf[js.Any]).asInstanceOf[T]
  
  type Deferrable[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: T[K] | std.Promise<T[K]>}
    */ typings.ethersprojectProperties.ethersprojectPropertiesStrings.Deferrable & TopLevel[js.Any]
}
