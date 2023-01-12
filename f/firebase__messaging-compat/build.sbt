organization := "org.scalablytyped"
name := "firebase__messaging-compat"
version := "0.1.21-8a5ecc"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "firebase__app" % "0.8.4-517873",
  "org.scalablytyped" %%% "firebase__app-compat" % "0.1.39-b03b7f",
  "org.scalablytyped" %%% "firebase__app-types" % "0.8.1-90f9cd",
  "org.scalablytyped" %%% "firebase__component" % "0.5.21-14f95c",
  "org.scalablytyped" %%% "firebase__logger" % "0.3.4-25e988",
  "org.scalablytyped" %%% "firebase__messaging" % "0.11.0-62b264",
  "org.scalablytyped" %%% "firebase__util" % "1.7.3-1eec82",
  "org.scalablytyped" %%% "sinon" % "10.0-dt-20220720Z-a1b7c7",
  "org.scalablytyped" %%% "sinonjs__fake-timers" % "8.1-dt-20220323Z-ea1648",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
