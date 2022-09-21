package typings.findPackageJson.anon

import org.scalablytyped.runtime.StringDictionary
import typings.findPackageJson.packageJsonMod.ScriptsInstallAfter
import typings.findPackageJson.packageJsonMod.ScriptsPublishAfter
import typings.findPackageJson.packageJsonMod.ScriptsRestart
import typings.findPackageJson.packageJsonMod.ScriptsStart
import typings.findPackageJson.packageJsonMod.ScriptsStop
import typings.findPackageJson.packageJsonMod.ScriptsTest
import typings.findPackageJson.packageJsonMod.ScriptsUninstallBefore
import typings.findPackageJson.packageJsonMod.ScriptsVersionBefore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Install
  extends StObject
     with /* k */ StringDictionary[js.UndefOr[String]] {
  
  var install: js.UndefOr[ScriptsInstallAfter] = js.undefined
  
  /**
    * Run code quality tools, e.g. ESLint, TSLint, etc.
    */
  var lint: js.UndefOr[String] = js.undefined
  
  var postinstall: js.UndefOr[ScriptsInstallAfter] = js.undefined
  
  /**
    * Run AFTER the tarball has been generated and moved to its final destination.
    */
  var postpack: js.UndefOr[String] = js.undefined
  
  var postpublish: js.UndefOr[ScriptsPublishAfter] = js.undefined
  
  var postrestart: js.UndefOr[ScriptsRestart] = js.undefined
  
  var poststart: js.UndefOr[ScriptsStart] = js.undefined
  
  var poststop: js.UndefOr[ScriptsStop] = js.undefined
  
  var posttest: js.UndefOr[ScriptsTest] = js.undefined
  
  /**
    * Run AFTER the package is uninstalled.
    */
  var postuninstall: js.UndefOr[String] = js.undefined
  
  /**
    * Run AFTER bump the package version.
    */
  var postversion: js.UndefOr[String] = js.undefined
  
  /**
    * Run BEFORE the package is installed.
    */
  var preinstall: js.UndefOr[String] = js.undefined
  
  /**
    * run BEFORE a tarball is packed (on npm pack, npm publish, and when installing git dependencies).
    */
  var prepack: js.UndefOr[String] = js.undefined
  
  /**
    * Run both BEFORE the package is packed and published, and on local npm install without any arguments. This is run AFTER prepublish, but BEFORE prepublishOnly.
    */
  var prepare: js.UndefOr[String] = js.undefined
  
  /**
    * Run BEFORE the package is published (Also run on local npm install without any arguments).
    */
  var prepublish: js.UndefOr[String] = js.undefined
  
  /**
    * Run BEFORE the package is prepared and packed, ONLY on npm publish.
    */
  var prepublishOnly: js.UndefOr[String] = js.undefined
  
  var prerestart: js.UndefOr[ScriptsRestart] = js.undefined
  
  var prestart: js.UndefOr[ScriptsStart] = js.undefined
  
  var prestop: js.UndefOr[ScriptsStop] = js.undefined
  
  var pretest: js.UndefOr[ScriptsTest] = js.undefined
  
  var preuninstall: js.UndefOr[ScriptsUninstallBefore] = js.undefined
  
  var preversion: js.UndefOr[ScriptsVersionBefore] = js.undefined
  
  /**
    * Publishes a package to the registry so that it can be installed by name. See https://docs.npmjs.com/cli/v8/commands/npm-publish
    */
  var publish: js.UndefOr[String] = js.undefined
  
  var restart: js.UndefOr[ScriptsRestart] = js.undefined
  
  /**
    * Start dev server to serve application files
    */
  var serve: js.UndefOr[String] = js.undefined
  
  var start: js.UndefOr[ScriptsStart] = js.undefined
  
  var stop: js.UndefOr[ScriptsStop] = js.undefined
  
  var test: js.UndefOr[ScriptsTest] = js.undefined
  
  var uninstall: js.UndefOr[ScriptsUninstallBefore] = js.undefined
  
  var version: js.UndefOr[ScriptsVersionBefore] = js.undefined
}
object Install {
  
  inline def apply(): Install = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Install]
  }
  
  extension [Self <: Install](x: Self) {
    
    inline def setInstall(value: ScriptsInstallAfter): Self = StObject.set(x, "install", value.asInstanceOf[js.Any])
    
    inline def setInstallUndefined: Self = StObject.set(x, "install", js.undefined)
    
    inline def setLint(value: String): Self = StObject.set(x, "lint", value.asInstanceOf[js.Any])
    
    inline def setLintUndefined: Self = StObject.set(x, "lint", js.undefined)
    
    inline def setPostinstall(value: ScriptsInstallAfter): Self = StObject.set(x, "postinstall", value.asInstanceOf[js.Any])
    
    inline def setPostinstallUndefined: Self = StObject.set(x, "postinstall", js.undefined)
    
    inline def setPostpack(value: String): Self = StObject.set(x, "postpack", value.asInstanceOf[js.Any])
    
    inline def setPostpackUndefined: Self = StObject.set(x, "postpack", js.undefined)
    
    inline def setPostpublish(value: ScriptsPublishAfter): Self = StObject.set(x, "postpublish", value.asInstanceOf[js.Any])
    
    inline def setPostpublishUndefined: Self = StObject.set(x, "postpublish", js.undefined)
    
    inline def setPostrestart(value: ScriptsRestart): Self = StObject.set(x, "postrestart", value.asInstanceOf[js.Any])
    
    inline def setPostrestartUndefined: Self = StObject.set(x, "postrestart", js.undefined)
    
    inline def setPoststart(value: ScriptsStart): Self = StObject.set(x, "poststart", value.asInstanceOf[js.Any])
    
    inline def setPoststartUndefined: Self = StObject.set(x, "poststart", js.undefined)
    
    inline def setPoststop(value: ScriptsStop): Self = StObject.set(x, "poststop", value.asInstanceOf[js.Any])
    
    inline def setPoststopUndefined: Self = StObject.set(x, "poststop", js.undefined)
    
    inline def setPosttest(value: ScriptsTest): Self = StObject.set(x, "posttest", value.asInstanceOf[js.Any])
    
    inline def setPosttestUndefined: Self = StObject.set(x, "posttest", js.undefined)
    
    inline def setPostuninstall(value: String): Self = StObject.set(x, "postuninstall", value.asInstanceOf[js.Any])
    
    inline def setPostuninstallUndefined: Self = StObject.set(x, "postuninstall", js.undefined)
    
    inline def setPostversion(value: String): Self = StObject.set(x, "postversion", value.asInstanceOf[js.Any])
    
    inline def setPostversionUndefined: Self = StObject.set(x, "postversion", js.undefined)
    
    inline def setPreinstall(value: String): Self = StObject.set(x, "preinstall", value.asInstanceOf[js.Any])
    
    inline def setPreinstallUndefined: Self = StObject.set(x, "preinstall", js.undefined)
    
    inline def setPrepack(value: String): Self = StObject.set(x, "prepack", value.asInstanceOf[js.Any])
    
    inline def setPrepackUndefined: Self = StObject.set(x, "prepack", js.undefined)
    
    inline def setPrepare(value: String): Self = StObject.set(x, "prepare", value.asInstanceOf[js.Any])
    
    inline def setPrepareUndefined: Self = StObject.set(x, "prepare", js.undefined)
    
    inline def setPrepublish(value: String): Self = StObject.set(x, "prepublish", value.asInstanceOf[js.Any])
    
    inline def setPrepublishOnly(value: String): Self = StObject.set(x, "prepublishOnly", value.asInstanceOf[js.Any])
    
    inline def setPrepublishOnlyUndefined: Self = StObject.set(x, "prepublishOnly", js.undefined)
    
    inline def setPrepublishUndefined: Self = StObject.set(x, "prepublish", js.undefined)
    
    inline def setPrerestart(value: ScriptsRestart): Self = StObject.set(x, "prerestart", value.asInstanceOf[js.Any])
    
    inline def setPrerestartUndefined: Self = StObject.set(x, "prerestart", js.undefined)
    
    inline def setPrestart(value: ScriptsStart): Self = StObject.set(x, "prestart", value.asInstanceOf[js.Any])
    
    inline def setPrestartUndefined: Self = StObject.set(x, "prestart", js.undefined)
    
    inline def setPrestop(value: ScriptsStop): Self = StObject.set(x, "prestop", value.asInstanceOf[js.Any])
    
    inline def setPrestopUndefined: Self = StObject.set(x, "prestop", js.undefined)
    
    inline def setPretest(value: ScriptsTest): Self = StObject.set(x, "pretest", value.asInstanceOf[js.Any])
    
    inline def setPretestUndefined: Self = StObject.set(x, "pretest", js.undefined)
    
    inline def setPreuninstall(value: ScriptsUninstallBefore): Self = StObject.set(x, "preuninstall", value.asInstanceOf[js.Any])
    
    inline def setPreuninstallUndefined: Self = StObject.set(x, "preuninstall", js.undefined)
    
    inline def setPreversion(value: ScriptsVersionBefore): Self = StObject.set(x, "preversion", value.asInstanceOf[js.Any])
    
    inline def setPreversionUndefined: Self = StObject.set(x, "preversion", js.undefined)
    
    inline def setPublish(value: String): Self = StObject.set(x, "publish", value.asInstanceOf[js.Any])
    
    inline def setPublishUndefined: Self = StObject.set(x, "publish", js.undefined)
    
    inline def setRestart(value: ScriptsRestart): Self = StObject.set(x, "restart", value.asInstanceOf[js.Any])
    
    inline def setRestartUndefined: Self = StObject.set(x, "restart", js.undefined)
    
    inline def setServe(value: String): Self = StObject.set(x, "serve", value.asInstanceOf[js.Any])
    
    inline def setServeUndefined: Self = StObject.set(x, "serve", js.undefined)
    
    inline def setStart(value: ScriptsStart): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setStop(value: ScriptsStop): Self = StObject.set(x, "stop", value.asInstanceOf[js.Any])
    
    inline def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
    
    inline def setTest(value: ScriptsTest): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
    
    inline def setUninstall(value: ScriptsUninstallBefore): Self = StObject.set(x, "uninstall", value.asInstanceOf[js.Any])
    
    inline def setUninstallUndefined: Self = StObject.set(x, "uninstall", js.undefined)
    
    inline def setVersion(value: ScriptsVersionBefore): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
