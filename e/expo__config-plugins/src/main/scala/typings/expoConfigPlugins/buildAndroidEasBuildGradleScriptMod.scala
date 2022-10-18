package typings.expoConfigPlugins

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildAndroidEasBuildGradleScriptMod extends Shortcut {
  
  @JSImport("@expo/config-plugins/build/android/EasBuildGradleScript", JSImport.Default)
  @js.native
  val default: /* // Build integration with EAS
  import java.nio.file.Paths
  android {
    signingConfigs {
    release {
    // This is necessary to avoid needing the user to define a release signing config manually
    // If no release config is defined, and this is not present, build for assembleRelease will crash
    }
    }
    buildTypes {
    release {
    // This is necessary to avoid needing the user to define a release build type manually
    }
    }
  }
  def isEasBuildConfigured = false
  tasks.whenTaskAdded {
    def debug = gradle.startParameter.taskNames.any { it.toLowerCase().contains('debug') }
    if (debug) {
    return
    }
    // We only need to configure EAS build once
    if (isEasBuildConfigured) {
    return
    }
    isEasBuildConfigured = true;
    android.signingConfigs.release {
    def credentialsJson = rootProject.file("../credentials.json");
    if (credentialsJson.exists()) {
    if (storeFile && !System.getenv("EAS_BUILD")) {
    println("Path to release keystore file is already set, ignoring 'credentials.json'")
    } else {
    try {
    def credentials = new groovy.json.JsonSlurper().parse(credentialsJson)
    def keystorePath = Paths.get(credentials.android.keystore.keystorePath);
    def storeFilePath = keystorePath.isAbsolute()
    ? keystorePath
    : rootProject.file("..").toPath().resolve(keystorePath);
    storeFile storeFilePath.toFile()
    storePassword credentials.android.keystore.keystorePassword
    keyAlias credentials.android.keystore.keyAlias
    if (credentials.android.keystore.containsKey("keyPassword")) {
    keyPassword credentials.android.keystore.keyPassword
    } else {
    // key password is required by Gradle, but PKCS keystores don't have one
    // using the keystore password seems to satisfy the requirement
    keyPassword credentials.android.keystore.keystorePassword
    }
    } catch (Exception e) {
    println("An error occurred while parsing 'credentials.json': " + e.message)
    }
    }
    } else {
    if (storeFile == null) {
    println("Couldn't find a 'credentials.json' file, skipping release keystore configuration")
    }
    }
    }
    android.buildTypes.release {
    signingConfig android.signingConfigs.release
    }
  }
    */ String = js.native
  
  type _To = /* // Build integration with EAS
  import java.nio.file.Paths
  android {
    signingConfigs {
    release {
    // This is necessary to avoid needing the user to define a release signing config manually
    // If no release config is defined, and this is not present, build for assembleRelease will crash
    }
    }
    buildTypes {
    release {
    // This is necessary to avoid needing the user to define a release build type manually
    }
    }
  }
  def isEasBuildConfigured = false
  tasks.whenTaskAdded {
    def debug = gradle.startParameter.taskNames.any { it.toLowerCase().contains('debug') }
    if (debug) {
    return
    }
    // We only need to configure EAS build once
    if (isEasBuildConfigured) {
    return
    }
    isEasBuildConfigured = true;
    android.signingConfigs.release {
    def credentialsJson = rootProject.file("../credentials.json");
    if (credentialsJson.exists()) {
    if (storeFile && !System.getenv("EAS_BUILD")) {
    println("Path to release keystore file is already set, ignoring 'credentials.json'")
    } else {
    try {
    def credentials = new groovy.json.JsonSlurper().parse(credentialsJson)
    def keystorePath = Paths.get(credentials.android.keystore.keystorePath);
    def storeFilePath = keystorePath.isAbsolute()
    ? keystorePath
    : rootProject.file("..").toPath().resolve(keystorePath);
    storeFile storeFilePath.toFile()
    storePassword credentials.android.keystore.keystorePassword
    keyAlias credentials.android.keystore.keyAlias
    if (credentials.android.keystore.containsKey("keyPassword")) {
    keyPassword credentials.android.keystore.keyPassword
    } else {
    // key password is required by Gradle, but PKCS keystores don't have one
    // using the keystore password seems to satisfy the requirement
    keyPassword credentials.android.keystore.keystorePassword
    }
    } catch (Exception e) {
    println("An error occurred while parsing 'credentials.json': " + e.message)
    }
    }
    } else {
    if (storeFile == null) {
    println("Couldn't find a 'credentials.json' file, skipping release keystore configuration")
    }
    }
    }
    android.buildTypes.release {
    signingConfig android.signingConfigs.release
    }
  }
    */ String
  
  /* This means you don't have to write `default`, but can instead just say `buildAndroidEasBuildGradleScriptMod.foo` */
  override def _to: /* // Build integration with EAS
  import java.nio.file.Paths
  android {
    signingConfigs {
    release {
    // This is necessary to avoid needing the user to define a release signing config manually
    // If no release config is defined, and this is not present, build for assembleRelease will crash
    }
    }
    buildTypes {
    release {
    // This is necessary to avoid needing the user to define a release build type manually
    }
    }
  }
  def isEasBuildConfigured = false
  tasks.whenTaskAdded {
    def debug = gradle.startParameter.taskNames.any { it.toLowerCase().contains('debug') }
    if (debug) {
    return
    }
    // We only need to configure EAS build once
    if (isEasBuildConfigured) {
    return
    }
    isEasBuildConfigured = true;
    android.signingConfigs.release {
    def credentialsJson = rootProject.file("../credentials.json");
    if (credentialsJson.exists()) {
    if (storeFile && !System.getenv("EAS_BUILD")) {
    println("Path to release keystore file is already set, ignoring 'credentials.json'")
    } else {
    try {
    def credentials = new groovy.json.JsonSlurper().parse(credentialsJson)
    def keystorePath = Paths.get(credentials.android.keystore.keystorePath);
    def storeFilePath = keystorePath.isAbsolute()
    ? keystorePath
    : rootProject.file("..").toPath().resolve(keystorePath);
    storeFile storeFilePath.toFile()
    storePassword credentials.android.keystore.keystorePassword
    keyAlias credentials.android.keystore.keyAlias
    if (credentials.android.keystore.containsKey("keyPassword")) {
    keyPassword credentials.android.keystore.keyPassword
    } else {
    // key password is required by Gradle, but PKCS keystores don't have one
    // using the keystore password seems to satisfy the requirement
    keyPassword credentials.android.keystore.keystorePassword
    }
    } catch (Exception e) {
    println("An error occurred while parsing 'credentials.json': " + e.message)
    }
    }
    } else {
    if (storeFile == null) {
    println("Couldn't find a 'credentials.json' file, skipping release keystore configuration")
    }
    }
    }
    android.buildTypes.release {
    signingConfig android.signingConfigs.release
    }
  }
    */ String = default
}
