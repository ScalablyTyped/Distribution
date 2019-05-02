organization := "org.scalablytyped"
name := "google-cloud__storage"
version := "2.5.0-1b15e1"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-2a9eae",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-855bd5",
  "org.scalablytyped" %%% "gaxios" % "1.8.3-18e96c",
  "org.scalablytyped" %%% "google-auth-library" % "3.1.2-719d92",
  "org.scalablytyped" %%% "google-cloud__common" % "0.32.0-8b1b9d",
  "org.scalablytyped" %%% "gtoken" % "2.3.3-6769ec",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190502Z-d681c7",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190412Z-51d288",
  "org.scalablytyped" %%% "std" % "3.4-495f93",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-4d74bf")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        