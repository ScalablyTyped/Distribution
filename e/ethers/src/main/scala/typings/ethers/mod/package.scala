package typings.ethers.mod

import typings.ethers.libUtilsMod.Logger
import typings.ethers.mod.^
import typings.ethersprojectNetworks.libTypesMod.Networkish
import typings.ethersprojectProviders.libBaseProviderMod.BaseProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def getDefaultProvider(): BaseProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultProvider")().asInstanceOf[BaseProvider]
inline def getDefaultProvider(network: Unit, options: Any): BaseProvider = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultProvider")(network.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[BaseProvider]
inline def getDefaultProvider(network: Networkish): BaseProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultProvider")(network.asInstanceOf[js.Any]).asInstanceOf[BaseProvider]
inline def getDefaultProvider(network: Networkish, options: Any): BaseProvider = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultProvider")(network.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[BaseProvider]

inline def logger: Logger = ^.asInstanceOf[js.Dynamic].selectDynamic("logger").asInstanceOf[Logger]

inline def version: /* "ethers/5.7.1" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[/* "ethers/5.7.1" */ String]
