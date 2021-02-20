package typings.fridaGum.ObjC

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.fridaGum.NativePointer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Constructor for instantiating a proxy object.
  *
  * @param target Target object to proxy to.
  * @param data Object with arbitrary data.
  */
@js.native
trait ProxyConstructor
  extends Instantiable1[(/* target */ NativePointer) | (/* target */ Object), ProxyInstance]
     with Instantiable2[
      (/* target */ NativePointer) | (/* target */ Object), 
      /* data */ InstanceData, 
      ProxyInstance
    ]
