package typings.firmata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


// TODO untested --- TWW
/* static member */
inline def decode(data: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]

// TODO untested --- TWW
/* static member */
inline def encode(data: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]

/* static member */
inline def isAcceptablePort(port: Port): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAcceptablePort")(port.asInstanceOf[js.Any]).asInstanceOf[Boolean]

/* static member */
inline def requestPort(callback: js.Function2[/* error */ Any, /* port */ Port, Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("requestPort")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
