organization := "org.scalablytyped"
name := "firebase__database-compat"
version := "0.2.6-a3fb5d"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "firebase__app" % "0.7.33-70e6f2",
  "org.scalablytyped" %%% "firebase__app-check-interop-types" % "0.1.0-a5d272",
  "org.scalablytyped" %%% "firebase__app-types" % "0.7.0-fb8d43",
  "org.scalablytyped" %%% "firebase__auth-interop-types" % "0.1.6-47169f",
  "org.scalablytyped" %%% "firebase__component" % "0.5.17-c48592",
  "org.scalablytyped" %%% "firebase__database" % "0.13.6-b6fc8b",
  "org.scalablytyped" %%% "firebase__database-types" % "0.9.13-424721",
  "org.scalablytyped" %%% "firebase__logger" % "0.3.3-442cc4",
  "org.scalablytyped" %%% "firebase__util" % "1.6.3-0d2002",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
