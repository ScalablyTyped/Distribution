package typings.firebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBuild extends js.Object {
  var build: String
  @JSName("build:console")
  var buildColonconsole: String
  var dev: String
  var lint: String
  @JSName("lint:fix")
  var lintColonfix: String
  var prebuild: String
  var prepare: String
  var prettier: String
  var test: String
  @JSName("test:all")
  var testColonall: String
  @JSName("test:browser")
  var testColonbrowser: String
  @JSName("test:browser:debug")
  var testColonbrowserColondebug: String
  @JSName("test:minified")
  var testColonminified: String
  @JSName("test:node")
  var testColonnode: String
  @JSName("test:node:persistence")
  var testColonnodeColonpersistence: String
  @JSName("test:node:persistence:prod")
  var testColonnodeColonpersistenceColonprod: String
  @JSName("test:node:prod")
  var testColonnodeColonprod: String
  @JSName("test:travis")
  var testColontravis: String
}

object AnonBuild {
  @scala.inline
  def apply(
    build: String,
    buildColonconsole: String,
    dev: String,
    lint: String,
    lintColonfix: String,
    prebuild: String,
    prepare: String,
    prettier: String,
    test: String,
    testColonall: String,
    testColonbrowser: String,
    testColonbrowserColondebug: String,
    testColonminified: String,
    testColonnode: String,
    testColonnodeColonpersistence: String,
    testColonnodeColonpersistenceColonprod: String,
    testColonnodeColonprod: String,
    testColontravis: String
  ): AnonBuild = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], dev = dev.asInstanceOf[js.Any], lint = lint.asInstanceOf[js.Any], prebuild = prebuild.asInstanceOf[js.Any], prepare = prepare.asInstanceOf[js.Any], prettier = prettier.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("build:console")(buildColonconsole.asInstanceOf[js.Any])
    __obj.updateDynamic("lint:fix")(lintColonfix.asInstanceOf[js.Any])
    __obj.updateDynamic("test:all")(testColonall.asInstanceOf[js.Any])
    __obj.updateDynamic("test:browser")(testColonbrowser.asInstanceOf[js.Any])
    __obj.updateDynamic("test:browser:debug")(testColonbrowserColondebug.asInstanceOf[js.Any])
    __obj.updateDynamic("test:minified")(testColonminified.asInstanceOf[js.Any])
    __obj.updateDynamic("test:node")(testColonnode.asInstanceOf[js.Any])
    __obj.updateDynamic("test:node:persistence")(testColonnodeColonpersistence.asInstanceOf[js.Any])
    __obj.updateDynamic("test:node:persistence:prod")(testColonnodeColonpersistenceColonprod.asInstanceOf[js.Any])
    __obj.updateDynamic("test:node:prod")(testColonnodeColonprod.asInstanceOf[js.Any])
    __obj.updateDynamic("test:travis")(testColontravis.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBuild]
  }
}

